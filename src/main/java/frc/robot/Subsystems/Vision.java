package frc.robot.Subsystems;
import org.photonvision.PhotonCamera;
import org.photonvision.PhotonUtils;
import org.photonvision.targeting.PhotonPipelineResult;
import org.photonvision.targeting.PhotonTrackedTarget;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Vision extends SubsystemBase{
    PhotonCamera cam=new PhotonCamera("objectCamera");

    @Override
    public void periodic(){
        PhotonPipelineResult res=cam.getLatestResult();
        if(res.hasTargets()){
            PhotonTrackedTarget target=res.getBestTarget();
            double distance=PhotonUtils.calculateDistanceToTargetMeters(1, 0, 0, Units.degreesToRadians(target.getPitch()));
            SmartDashboard.putNumber("Distance",distance);
        }
    }
}
