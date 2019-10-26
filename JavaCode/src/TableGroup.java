package com.company;

public class TableGroup {
    Table table;
    Chair chairs;
    int group_number;

    public TableGroup(Table table, Chair chairs)
    {
        this.table = table;
        this.chairs = chairs;
        this.group_number = table.table_number;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Chair getChairs() {
        return chairs;
    }

    public void setChairs(Chair chairs) {
        this.chairs = chairs;
    }

    public int getGroup_number() {
        return group_number;
    }

    public void setGroup_number(int group_number) {
        this.group_number = group_number;
    }
}
