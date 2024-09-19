package frc.robot.Subsystems;

import org.photonvision.PhotonCamera;
import org.photonvision.targeting.PhotonTrackedTarget;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Vision extends SubsystemBase{
    
    PhotonCamera camera = new PhotonCamera("objectCamera");

    @Override
    public void periodic(){
        var result = camera.getLatestResult();
        boolean hasTargets = result.hasTargets();
        if(hasTargets){
            PhotonTrackedTarget target = result.getBestTarget();
            double yaw = target.getYaw();
            System.out.println(yaw);
        }
        

    }
}
