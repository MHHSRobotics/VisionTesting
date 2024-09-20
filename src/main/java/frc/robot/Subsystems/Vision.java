package frc.robot.Subsystems;
import org.photonvision.PhotonCamera;
import org.photonvision.PhotonUtils;
import org.photonvision.targeting.PhotonPipelineResult;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Vision extends SubsystemBase{
    PhotonCamera cam=new PhotonCamera("objectCamera");

    @Override
    public void periodic(){
        PhotonPipelineResult res=cam.getLatestResult();
        if(res.hasTargets()){
            double distance = PhotonUtils.calculateDistanceToTargetMeters(1, 0, -0.7854, res.getBestTarget().getPitch()*(3.14159/180));
            System.out.println(distance);
        }
    }
}
