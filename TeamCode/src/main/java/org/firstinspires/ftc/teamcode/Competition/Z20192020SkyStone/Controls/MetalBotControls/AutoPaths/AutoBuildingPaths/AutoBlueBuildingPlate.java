package org.firstinspires.ftc.teamcode.Competition.Z20192020SkyStone.Controls.MetalBotControls.AutoPaths.AutoBuildingPaths;//package org.firstinspires.ftc.teamcode.Compitition.ZCompetitionSkyStone.Controls.MetalBotControls.AutoPaths.AutoBuildingPaths;
//
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
//
//import org.firstinspires.ftc.teamcode.Compitition.ZCompetitionSkyStone.Controls.MetalBotControls.AutoBuilding;
//import org.firstinspires.ftc.teamcode.Compitition.ZCompetitionSkyStone.robots.MetalBot;
//
//@Autonomous(name = "Blue:Building Plate:")
//@Disabled
//public class AutoBlueBuildingPlate extends AutoBuilding {
//
//    public MetalBot Bot = new MetalBot();
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//
//        Bot.initRobot(hardwareMap, "Build");
//        Bot.setLinearOp(this);
//        //Bot.HookRelease();
//
//        setLinearOp(this);
//
//
//
//        waitForStart();
//
//        while (opModeIsActive()) {
//
//            Bot.HookRelease();
//
//            goToBuildPlate(Bot, "Blue");
//
//            orientBuildPlateBuild(Bot, "Blue");
//
//            pushBuildPlate(Bot, "Blue");
//
//            parkBuildingPlateInner(Bot, "Blue");
//
//            idle();
//            requestOpModeStop();
//        }
//        idle();
//
//    }
//}
