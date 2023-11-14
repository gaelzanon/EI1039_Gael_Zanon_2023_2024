package Actividad_6_2;

public class DemoStrategySimple {
    public static void main(String[] args) {
        System.out.println("--- KNN with Euclidean distance ---");
        ContextSimple context = new ContextSimple(new ClassifierKnn());
        context.setDistanceMetric(new DistanceEuclidean());
        context.run();

        System.out.println("--- KNN with Manhattan distance ---");
        context.setDistanceMetric(new DistanceManhattan());
        context.run();

        System.out.println("--- K-means with Manhattan distance ---");
        context.setClassifierStrategy(new ClassifierKmeans());
        context.setDistanceMetric(new DistanceManhattan());
        context.run();

        System.out.println("--- SOM with Euclidean distance ---");
        context.setClassifierStrategy(new ClassifierSOM());
        context.setDistanceMetric(new DistanceEuclidean());
        context.run();
    }
}
