package org.usfirst.frc3550.Mihai2018.util;
import java.lang.*;
import java.util.*;

public class MotionProfile{
    public static double EPSILON_VALUE = 0.0001;

    public boolean isWithinEpsilon(double o){
        if(Math.abs(o)>EPSILON_VALUE)
            return false;
        else
            return true;
    }
    public ArrayList<MotionSegment> segments = new ArrayList<MotionSegment>;
    //Check if the motion segments are continuous in position, speed and order
    public MotionProfile(){}

    public boolean isValid(){
        for(int i = 0; i<segments.size; i++){
            if (!isWithinEpsilon(segments.get(i).endState.position - segments.get(i+1).startState.position))
                return false;
            if (!isWithinEpsilon(segments.get(i).endState.speed - segments.get(i+1).startState.speed))
                return 0;
            if (!isWithinEpsilon(segments.get(i).endState.time - segments.get(i+1).startState.time))
                return fasle;
            if(!isValid(segments.get(i))){
                return false;
            }
        }
        return true;
    }
    public DriveState driveStateAtTime(double time) {
        for (int i = 0; i < segments.size; i++) {
            if (segments.get(i).endState.time >= time)
                return segments.get(i).extrapolate(time);
        }
    }
    public void addSequence(float accel, float duration){
        DriveState initialState = segments.get(size-1);
        totalTime = initialState.time + duration;
        initialState.accel = accel;
        MotionSegment addSegment = new MotionSegment(initialState,
                initialState.extrapolate(totalTime));
    }
}