package org.firstinspires.ftc.teamcode.opmodes;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.hardware.lynx.LynxModule;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.subsystems.drivetrain.DriveTrain;
import org.firstinspires.ftc.teamcode.subsystems.elevator.Elevator;

public abstract class BaseOpMode extends LinearOpMode{
    public MultipleTelemetry t;
    public DriveTrain drive;
    public GamepadEx pilot;
    //public GamepadEx copilot;

    public void runOpMode() throws InterruptedException {
        t = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());
        pilot = new GamepadEx(gamepad1);
        //copilot = new GamepadEx(gamepad2);
        drive = new DriveTrain(hardwareMap);
        onInit();
        while (!isStarted()) {
            onInitLoop();
        }
        waitForStart();
        onStart();
        while (!isStopRequested() && opModeIsActive()) {
            pilot.readButtons();
            onLoop();
            drive.update();
        }
        onStop();
    }

    public void onInit() {
    }

    public void onInitLoop() {
    }

    public void onStart() {
    }

    public void onLoop() {
    }

    public void onStop() {
    }
}
