package org.firstinspires.ftc.teamcode.drive.subsystems;

import static org.firstinspires.ftc.teamcode.drive.subsystems.ElevatorState.IDLE;

import com.acmerobotics.roadrunner.geometry.Pose2d;

public class SharedStates {
    /**
     * Simple static field serving as a storage medium for the bot's pose.
     * This allows different classes/opmodes to set and read from a central source of truth.
     * A static field allows data to persist between opmodes.
     */
    public static Pose2d currentPose = null;
    public static ElevatorState elevatorState = IDLE;
}