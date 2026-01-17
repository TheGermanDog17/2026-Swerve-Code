package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkFlex;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class FuelShooterSubsystem extends SubsystemBase{
    //Fuel Shooter
    private SparkFlex fuelShooterMotorIn;  // First motor that intakes the fuel in the shooter
    private SparkFlex fuelShooterMotorOut; // Second motor that shoots fuel out

    public FuelShooterSubsystem() {
        fuelShooterMotorIn = new SparkFlex(Constants.FuelShooterConstants.FUEL_SHOOTER_MOTOR_IN_ID, MotorType.kBrushless);
        fuelShooterMotorOut = new SparkFlex(Constants.FuelShooterConstants.FUEL_SHOOTER_MOTOR_OUT_ID, MotorType.kBrushless); 
    }

}
