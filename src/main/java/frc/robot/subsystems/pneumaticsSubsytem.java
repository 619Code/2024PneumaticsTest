// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class pneumaticsSubsytem extends SubsystemBase {
  private final DoubleSolenoid solenoid;

  public pneumaticsSubsytem() {
    solenoid = new DoubleSolenoid(10, PneumaticsModuleType.REVPH, Constants.solenoidForwardPort, Constants.solenoidBackwardPort);
    solenoid.set(DoubleSolenoid.Value.kReverse);
  }

  public void reversePneumaticsState() {
    solenoid.toggle();
  }
  
  @Override
  public void periodic() {
    System.out.println(solenoid.get());
  }

}
