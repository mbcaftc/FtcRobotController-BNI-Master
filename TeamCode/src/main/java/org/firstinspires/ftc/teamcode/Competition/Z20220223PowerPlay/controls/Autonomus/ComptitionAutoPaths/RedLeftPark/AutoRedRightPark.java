package org.firstinspires.ftc.teamcode.Competition.Z20220223PowerPlay.controls.Autonomus.ComptitionAutoPaths.RedLeftPark;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

import org.firstinspires.ftc.teamcode.Compitition.ZPowerPlay.Robots.CompetionBot;
import org.firstinspires.ftc.teamcode.Compitition.ZPowerPlay.Robots.StraferBot;
import org.firstinspires.ftc.teamcode.Compitition.ZPowerPlay.controls.Autonomus.ComptitionAutoPaths.AutoTargetZone;
@Disabled
@Autonomous (name = "Detection - Blue Right || Red Right")
public class AutoRedRightPark extends RedRightPark {

    public CompetionBot Bot = new CompetionBot();

    public StraferBot BotStrafer = new StraferBot();

    public AutoTargetZone targetZone = null;

    public boolean isCompetition = true;

    @Override
    public void runOpMode() throws InterruptedException {

        if (isCompetition == true) {
            Bot.initRobot(hardwareMap);

            Bot.setLinearOp(this);

        } else {

            BotStrafer.initRobot(hardwareMap);

            BotStrafer.setLinearOp(this);

        }

        // Initialize WebCam and Create Image Processing Pipeline
        initializePipeline();

        //targetZone = AutoTargetZone.A;

        telemetry.addLine("WAITING FOR START >");
        telemetry.addData("TARGET ZONE: ", TargetZone);
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {

            Bot.turretPlatform.setPower(0);

            // Find Tags During the Init Loop
//            while (!isStarted() && !isStopRequested()) {
//                findTag();
//                sleep(20);
//            }

            //detect tags in auto main

            detectTags();

            if (isCompetition == true) {

                Bot.closeGrabberArms();

                sleep(1000);

                Bot.extendGrabberLift(0.5);

                sleep(275);

                Bot.stopGrabberLift();

            }

            //targetZone = DetectSleaveImage(Bot);

            telemetry.addData("TARGET ZONE: ", TargetZone);
            telemetry.update();

            sleep(1000);

            if (isCompetition == true) {

                parkplace(Bot, TargetZone);
                sleep(1000);

            } else {

                parkplace(BotStrafer, TargetZone);

            }



            idle();
            requestOpModeStop();
        }
    }
}
