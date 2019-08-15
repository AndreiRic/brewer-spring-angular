package com.algaworks.brewer.api.dto;

public class VendaMes {

    public static final String SQL = "SELECT date_format(data_criacao, '%Y/%m') mes,		   "+
                                     "	   COUNT(*) total									   "+
                                     "FROM venda 											   "+
                                     "WHERE   data_criacao > DATE_SUB(now(), INTERVAL 6 MONTH) "+
                                     "	AND now()        > data_criacao						   "+
                                     " 	AND status = 'EMITIDA'								   "+
                                     "GROUP BY date_format(data_criacao, '%Y/%m')			   "+
                                     "ORDER BY date_format(data_criacao, '%Y/%m') DESC         ";

    private String mes;
    private Integer total;

    public VendaMes(String mes, Integer total) {
        this.mes = mes;
        this.total = total;
    }

    public VendaMes() {
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
