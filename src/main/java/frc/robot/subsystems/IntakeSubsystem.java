package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.hardware.TalonFXS;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {
    
    private TalonFX intakeMotor;
    private TalonFXS pivotMotor;
    private PIDController pivotPid;

    public IntakeSubsystem(){
        intakeMotor = new TalonFX(Constants.IntakeConstants.INTAKE_MOTOR_ID, "rio");
        pivotMotor = new TalonFXS(Constants.IntakeConstants.PIVOT_MOTOR_ID, "rio");

    }
}
