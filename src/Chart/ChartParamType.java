package Chart;

public enum ChartParamType {
    VELOCITY("velocity"),
    ANGLE("steer angle"),
    BLDC_1_POSITION("BLDC Motor 1 Position"),
    BLDC_2_POSITION("BLDC Motor 2 Position"),
    BLDC_1_POS_DUTY_CYCLE("BLDC Motor 1 DutyCycle"),
    BLDC_2_POS_DUTY_CYCLE("BLDC Motor 2 DutyCycle"),

    ;

    private String mName;

    ChartParamType(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }
}