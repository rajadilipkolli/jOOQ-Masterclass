package com.classicmodels.service;

import com.classicmodels.repository.ClassicModelsRepository;
import java.util.List;
import org.jooq.Record;
import static jooq.generated.tables.Sale.SALE;
import jooq.generated.tables.records.SaleRecord;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;
import org.springframework.stereotype.Service;

@Service
public class ClassicModelsService {

    private final ClassicModelsRepository classicModelsRepository;

    public ClassicModelsService(ClassicModelsRepository classicModelsRepository) {
        this.classicModelsRepository = classicModelsRepository;
    }

    public void callAll() {

        // Day 1
        List<SaleRecord> r1 = classicModelsRepository.filterByFiscalYear(2004);
        System.out.println("EXAMPLE 1:\n" + r1);

        // Day 2
        List<SaleRecord> r2 = classicModelsRepository.filterByTrend("UP");
        System.out.println("EXAMPLE 2:\n" + r2);

        // Day 3
        List<SaleRecord> r3 = classicModelsRepository.filterByFiscalYearAndTrend(2004, "UP");
        System.out.println("EXAMPLE 3:\n" + r3);

        // Day 4
        List<SaleRecord> r4 = classicModelsRepository.filterBy1(
                List.of(SALE.FISCAL_YEAR.eq(2004), SALE.TREND.eq("DOWN"), SALE.EMPLOYEE_NUMBER.eq(1370L)));
        System.out.println("EXAMPLE 4:\n" + r4);

        // Day 5
        List<SaleRecord> r5 = classicModelsRepository.filterBy2(s -> s.SALE_.gt(4000d));
        System.out.println("EXAMPLE 5:\n" + r5);
        
        // Day 6
        List<SaleRecord> r6 = classicModelsRepository.filterBy3(s -> s.SALE_.gt(4000d));
        System.out.println("EXAMPLE 6:\n" + r6);
        
        // Day 7
        List<SaleRecord> r7 = classicModelsRepository.filterBy4(
                s -> s.SALE_.gt(4000d), s -> s.TREND.eq("DOWN"), s -> s.EMPLOYEE_NUMBER.eq(1370L));
        System.out.println("EXAMPLE 7:\n" + r7);
        
        // Day 8
        List<SaleRecord> r8 = classicModelsRepository.filterBy5(SALE, 
                s -> s.SALE_.gt(4000d), s -> s.TREND.eq("DOWN"), s -> s.EMPLOYEE_NUMBER.eq(1370L));
        System.out.println("EXAMPLE 8:\n" + r8);
        
        // Day 9
        List<Record> r9 = classicModelsRepository.filterBy6(SALE, 
                () -> List.of(SALE.SALE_ID, SALE.FISCAL_YEAR),
                s -> s.SALE_.gt(4000d), s -> s.TREND.eq("DOWN"), s -> s.EMPLOYEE_NUMBER.eq(1370L));
        System.out.println("EXAMPLE 9:\n" + r9);
        
        // Still day 9        
        List<Record> r10 = classicModelsRepository.filterBy7(table("sale"), 
                () -> List.of(field("sale_id"), field("fiscal_year")),
                s -> field("sale").gt(4000d), s -> field("trend").eq("DOWN"), s -> field("employee_number").eq(1370L));
        System.out.println("EXAMPLE 10:\n" + r10);
        
        // Still day 9        
        List<Record> r11 = classicModelsRepository.filterBy9(SALE, 
                () -> List.of(SALE.SALE_ID, SALE.FISCAL_YEAR),
                () -> List.of(SALE.SALE_.gt(4000d), SALE.TREND.eq("DOWN"), SALE.EMPLOYEE_NUMBER.eq(1370L)));
        System.out.println("EXAMPLE 11:\n" + r11);
        
        // Still day 9        
        List<Record> r12 = classicModelsRepository.filterBy9(table("sale"), 
                () -> List.of(field("sale_id"), field("fiscal_year")),
                () -> List.of(field("sale").gt(4000d), field("trend").eq("DOWN"), field("employee_number").eq(1370L)));
        System.out.println("EXAMPLE 12:\n" + r12);
    }
}