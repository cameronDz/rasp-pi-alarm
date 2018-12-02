package edu.ccsu.cs417.dgt.state;

import edu.ccsu.cs417.dgt.strategy.UserNotification;

/**
 * Class representing an armed security system state in the state design pattern
 * 
 * @author Tom
 */
public class ArmedState implements DetectorState {

	SecuritySystem securitySystem;

	/**
	 * Empty constructor, instantiates new SecuritySystem variable.
	 */
	public ArmedState() {
            securitySystem = new SecuritySystem();
	}

	/**
	 * Loaded constructor, set parameter as SecuritySystem variable.
	 * 
	 * @param newSecuritySystem
	 *            SecuritySystem to arm/disarm.
	 */
	public ArmedState(SecuritySystem newSecuritySystem) {
            securitySystem = newSecuritySystem;
	}

	/**
	 * Method to arm an armed state in the security system.
	 * 
	 * @param notifier
	 *            used to notify the user when sensor is triggered
	 */
	@Override
	public void arm(UserNotification notifier) {
            System.out.println("System is already armed.");
	}

	/**
	 * Method to disarm an armed state in the security system.
	 */
	@Override
	public void disarm() {
            System.out.println("System has been disarmed.");
            securitySystem.setDetectorState(securitySystem.getIsDisarmedState());
	}
}
