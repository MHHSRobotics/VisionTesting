package frc.robot.Subsystems;
import org.photonvision.PhotonCamera;
import org.photonvision.targeting.PhotonPipelineResult;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Vision extends SubsystemBase{
    PhotonCamera cam=new PhotonCamera("objectCamera");

    @Override
    public void periodic(){
        PhotonPipelineResult res=cam.getLatestResult();
        if(res.hasTargets()){
            System.out.println(res.getBestTarget().getYaw());
        }
    }
}
