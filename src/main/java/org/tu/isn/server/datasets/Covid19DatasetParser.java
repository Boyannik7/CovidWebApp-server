package org.tu.isn.server.datasets;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Covid19DatasetParser implements DatasetParser {

    @Override
    public int getDateIndex() {
        return 0;
    }

    @Override
    public int getCountryNameIndex() {
        return 1;
    }

    @Override
    public int getConfirmedIndex() {
        return 2;
    }

    @Override
    public int getDeathsIndex() {
        return 3;
    }

    @Override
    public int getRecoveredIndex() {
        return 4;
    }

    @Override
    public int getActiveIndex() {
        return 5;
    }

    @Override
    public int getNewCasesIndex() {
        return 6;
    }

    @Override
    public int getNewDeathsIndex() {
        return 7;
    }

    @Override
    public int getNewRecoveredIndex() {
        return 8;
    }

    @Override
    public int getNumberOfFields() {
        return 9;
    }

    @Override
    public InputStream getContent() throws IOException {
        return Files.newInputStream(Paths.get("data/full_grouped.csv"));
    }
}
