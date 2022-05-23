package frc.robot.commands;
import edu.wpi.first.math.controller.PIDController;
import frc.robot.Constants;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class TurnToAngle extends PIDCommand {
/** 
   * @param targetAngleDegrees
   *@param param2 //The drive subsystem to use
*/
    public final Drivetrain param2 = new Drivetrain();

    public TurnToAngle(double targetAngleDegrees, Drivetrain param2) {
        super(
        new PIDController(1, 0, 0),
        // Close loop on heading
        param2::getHeading,
        // Set reference to target
        targetAngleDegrees,
        // Pipe output to turn robot
        output -> param2.arcadeDrive(0.0, output),
        // Require the drive
        param2);

            // Set the controller to be continuous (because it is an angle controller)
    getController().enableContinuousInput(-180, 180);
    // Set the controller tolerance - the delta tolerance ensures the robot is stationary at the
    // setpoint before it is considered as having reached the reference
    getController()
        .setTolerance(5, 10);
    }

    @Override
    public boolean isFinished() {
      // End when the controller is at the reference.
      return getController().atSetpoint();
    }
}