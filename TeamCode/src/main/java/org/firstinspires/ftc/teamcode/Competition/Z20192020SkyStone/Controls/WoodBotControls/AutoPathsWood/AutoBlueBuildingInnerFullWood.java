package org.firstinspires.ftc.teamcode.Competition.Z20192020SkyStone.Controls.WoodBotControls.AutoPathsWood;//package org.firstinspires.ftc.teamcode.Compitition.ZCompetitionSkyStone.Controls.WoodBotControls.AutoPathsWood;
//
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//
//import org.firstinspires.ftc.teamcode.Compitition.ZCompetitionSkyStone.Controls.WoodBotControls.AutoBuildingWood;
//import org.firstinspires.ftc.teamcode.Compitition.ZCompetitionSkyStone.robots.WoodBot;
//
//@Autonomous(name = "Bot:Wood Auto:Blue Building:Inner: Full")
//@Disabled
//public class AutoBlueBuildingInnerFullWood extends AutoBuildingWood {
//
//    public WoodBot Bot = new WoodBot();
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//
//        Bot.initRobot(hardwareMap);
//        Bot.setLinearOp(this);
//
//        setLinearOp(this);
//
//
//
//        waitForStart();
//
//        while (opModeIsActive()) {
//
//            alignBuildPlate(Bot, "Blue");
//            sleep(sleepTime);
//
//            goToSkystones(Bot, "Blue");
//            sleep(sleepTime);
//
//            Bot.driveBackward(midSpeed, .5);
//
//            //detectStoneDistance(Bot);
//
//            detectSkyStone (Bot, "Blue");
//            sleep(sleepTime);
//
//            detectStoneDistance(Bot);
//
//            manipulateStone(Bot, "grab");
//            sleep(sleepTime);
//
//            removeSkyStoneInner(Bot, "Blue");
//
//            adjustToDropSkyStone(Bot, "Blue");
//
//            dropStone(Bot);
//
//            park (Bot, "Blue");
//
//            requestOpModeStop();
//        }
//        idle();
//
//    }
//}
