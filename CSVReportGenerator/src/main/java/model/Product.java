package model;

import annotations.CSVColumn;
import annotations.CSVReport;

import java.util.UUID;

@CSVReport
public record Product(@CSVColumn(columnName = "id") UUID id,
                      @CSVColumn(columnName = "product name") String name,
                      @CSVColumn(columnName = "price in dollars") double price) {
}
