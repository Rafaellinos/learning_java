public class PaintJob {

    /*
        Problem:
        Bob is a wall painter and he needs your help.
        You have to write a program that helps Bob calculate how many buckets of paint he
        needs to buy before going to work. Bob might also have some extra buckets at home.
        He also knows the area that he can cover with one bucket of paint.
        See : https://www.udemy.com/course/java-the-complete-java-developer-course/learn/quiz/4585910#questions
     */

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = height * width;
        double bucketsNeeded = (area / areaPerBucket) - extraBuckets;
        return (int) Math.ceil(bucketsNeeded);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double bucketsNeeded = (area / areaPerBucket);
        return (int) Math.ceil(bucketsNeeded);
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

        // using overload without extraBuckets
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));

        // using area
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));

    }
}
