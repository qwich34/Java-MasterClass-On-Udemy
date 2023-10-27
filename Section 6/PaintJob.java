public class PaintJob {
    // write your code here
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double bucket = getBucketCount(width,height,areaPerBucket);
        bucket -= extraBuckets;
        return (int)bucket;

    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double area = width * height;
        return getBucketCount(area, areaPerBucket);
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double buckets = area / areaPerBucket;
        return (int)Math.ceil(buckets);
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
    }
}