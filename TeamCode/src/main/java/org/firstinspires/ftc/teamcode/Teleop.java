package org.firstinspires.ftc.teamcode;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name  = "First Teleop", group = "1")
public class Teleop extends LinearOpMode {
    DcMotor r1;
    DcMotor r2;
    DcMotor l1;
    DcMotor l2;

    DcMotor lift;

    Servo clawwheel;

    double SpeedMultiplier = 0.50;

    @Override
    public void runOpMode() throws InterruptedException {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        r1 = hardwareMap.get(DcMotor.class, "r1");
        r2 = hardwareMap.get(DcMotor.class, "r2");
        l1 = hardwareMap.get(DcMotor.class, "l1");
        l2 = hardwareMap.get(DcMotor.class, "l2");
        lift = hardwareMap.get(DcMotor.class, "lift");
        clawwheel = hardwareMap.get(Servo.class,"clawwheel");

        drive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        waitForStart();

        while(!isStopRequested()) {

        }
        }
    }
}
