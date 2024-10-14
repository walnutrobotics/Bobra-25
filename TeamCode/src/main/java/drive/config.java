package org.firstinspires.ftc.teamcode.drive;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
@Config
public class config
{
    public static double armP = 0.00008;
    public static double armI = 0;
    public static double armD = 0;
    public static double armA = 0;

    public static double lastError = 0;

    public static double integeralSum = 0;
}
