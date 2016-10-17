package io.confluent.ksql.parser.tree;


import java.util.Objects;
import java.util.Optional;

import static com.google.common.base.MoreObjects.toStringHelper;

public class ShowQueries extends Statement {

    public ShowQueries(Optional<NodeLocation> location) {
        super(location);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash("ShowQueries");
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public String toString()
    {
        return toStringHelper(this)
                .toString();
    }
}
