package fit.core;

import java.util.ArrayList;
import java.util.List;

public class SpendRepository {
    private final List<Spend> all;

    public SpendRepository() {
        this.all = new ArrayList<Spend>();
    }

    public SpendRepository(List<Spend> repoSource) {
        this.all = repoSource;
    }

    public boolean add(Spend spend) {
        return all.add(spend);
    }

    public boolean contains(Spend spend) {
        return this.all.contains(spend);
    }

    public int size() {
        return this.all.size();
    }
}
