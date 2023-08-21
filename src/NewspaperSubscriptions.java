import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewspaperSubscriptions {

    public static void main(String[] args) {
        Map<String, double[]> subscriptions = new HashMap<>();
        subscriptions.put("TO", new double[]{3, 3, 3, 6});
        subscriptions.put("Hindu", new double[]{2.5, 2.5, 2.5, 25, 25, 4});
        subscriptions.put("ET", new double[]{4, 4, 4, 4, 10});
        subscriptions.put("BM", new double[]{15, 15, 1.5, 1.5, 15, 15, 1.5});
        subscriptions.put("HT", new double[]{2, 2, 2});

        double budget = 40;

        List<List<String>> validCombinations = new ArrayList<>();
        generateCombinations(subscriptions.keySet(), new ArrayList<>(), validCombinations, budget, subscriptions);

        System.out.println("Possible combinations within budget:");
        for (List<String> combination : validCombinations) {
            double totalCost = 0;
            for (String subscription : combination) {
                for (double cost : subscriptions.get(subscription)) {
                    totalCost += cost;
                }
            }
            System.out.println("Total Cost: " + totalCost + ", Subscriptions: " + combination);
        }
    }

    private static void generateCombinations(
            Iterable<String> subscriptions,
            List<String> currentCombination,
            List<List<String>> validCombinations,
            double budget,
            Map<String, double[]> subscriptionCosts) {

        double totalCost = calculateTotalCost(currentCombination, subscriptionCosts);
        if (totalCost > budget) {
            return;
        }

        if (totalCost <= budget) {
            validCombinations.add(new ArrayList<>(currentCombination));
        }

        for (String subscription : subscriptions) {
            currentCombination.add(subscription);
            generateCombinations(subscriptions, currentCombination, validCombinations, budget, subscriptionCosts);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    private static double calculateTotalCost(List<String> combination, Map<String, double[]> subscriptionCosts) {
        double totalCost = 0;
        for (String subscription : combination) {
            for (double cost : subscriptionCosts.get(subscription)) {
                totalCost += cost;
            }
        }
        return totalCost;
    }
}
