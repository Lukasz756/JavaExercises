package Exercises.Enums.Ex2;

public enum PackageSize {
    SMALL(20,40),
    MEDIUM(40,60),
    LARGE(60,80),
    UNKNOWN(0,0);
    private int minSize;
    private int maxSize;

    PackageSize(int minSize,int maxSize){
        this.minSize = minSize;
        this.maxSize = maxSize;
    }
    public static PackageSize getPackageSize(int minSize,int maxSize){
        for(PackageSize packageSize : values()){
            if(minSize >= packageSize.minSize && maxSize <= packageSize.maxSize){
                return packageSize;
            }
        }
        return UNKNOWN;
    }

}
