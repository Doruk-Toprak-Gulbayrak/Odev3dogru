// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.


package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  public TalonFX mIntakeMotor;
  public DigitalInput intakesensor = new DigitalInput(1);
  public Intake() {
    mIntakeMotor = new TalonFX(1);
   

  }

  public void setIntake(double speed) {
    mIntakeMotor.set(speed);
  }
  
  public boolean getSensor()
  {
    return intakesensor.get();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
