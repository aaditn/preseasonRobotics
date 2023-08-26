package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
@TeleOp
public class arcadeTele extends LinearOpMode {
    DcMotorEx leftFront;
    DcMotorEx rightFront;
    DcMotorEx leftBack;
    DcMotorEx rightBack;

    public void runOpMode() {

        // initialize and configure here
        leftFront = hardwareMap.get(DcMotorEx.class, "leftFront");
        rightFront = hardwareMap.get(DcMotorEx.class, "rightFront");
        leftBack = hardwareMap.get(DcMotorEx.class, "leftBack");
        rightBack = hardwareMap.get(DcMotorEx.class, "rightBack");

        // reverse any motors that should be reversed

        waitForStart(); // so that the code doesn't end before the start button is clicked

        while (opModeIsActive()) {
            double y = gamepad1.left_stick_y;
            double x = gamepad1.right_stick_x;
            leftFront.setPower(y + x);
            leftBack.setPower(y + x);
            rightFront.setPower(y - x);
            rightBack.setPower(y - x);
        }
    }
}
