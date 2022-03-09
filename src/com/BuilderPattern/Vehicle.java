package com.BuilderPattern;

class Vehicle{
    //required parameter
    private final String engine;
    private final int wheel;

    //optional parameter
    private final int airbags;

    public String getEngine(){
        return this.engine;
    }

    public int getWheel(){
        return this.wheel;
    }

    public int getAirbags() {
        return this.airbags;
    }

    Vehicle(VehicleBuilder builder){
        this.engine=builder.engine;
        this.wheel=builder.wheel;
        this.airbags=builder.airbags;
    }

    public static class VehicleBuilder {
        private final String engine;
        private final int wheel;

        private int airbags;

        public VehicleBuilder(String engine, int wheel){
            this.engine = engine;
            this.wheel=wheel;
        }

        public VehicleBuilder setAirbags(int airbags){
            this.airbags=airbags;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }


}
