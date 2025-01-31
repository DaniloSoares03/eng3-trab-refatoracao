/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.poo.biblioteca.Entidades;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class Emprestimo implements Serializable, Comparable<Emprestimo> {

    private Usuario usuario;
    private Exemplares exemplares;
    private Date dia_Emprestimo, dia_Pra_Entregar, dia_Entrege;
    private String estado;
    private int diasAtrasados;//
    private LocalDateTime dueDate;
    private LocalDateTime deliveryDate;
    private String state;
    private int daysOverdue;
    public static final int ATRAZO_PADRAO = 3;

    /**
     *
     * @param usuario O usuario a realizar o emprestimo
     * @param exemplares O exemplar a ser emprestado
     */
    public Emprestimo(Usuario usuario, Exemplares exemplares) {
        this.usuario = usuario;
        this.exemplares = exemplares;
        this.dia_Emprestimo = new Date();
        this.dia_Pra_Entregar = new Date();
        this.dia_Pra_Entregar.setTime(dia_Pra_Entregar.getTime()
                + (Constans.UM_DIA * usuario.getLimite_Dias()));
        this.updateState();
        this.diasAtrasados = 0;
    }

    /**
     * Atualiza o estdo atual do emprestimo. Se o dia entrege for null ou se a
     * data de agora for maior que a data definida a ser entregado, define como
     * "ATRASADO". Se o dia entrege for null ou se a data de agora for menor que
     * a data definida a ser entregado, difine como "EM ANDAMENTO"
     */
    public void updateState() {
        LocalDateTime now = LocalDateTime.now();

        if (isOverdue(now)) {
            setOverdueState(now);
        } else if (isInProgress(now)) {
            setInProgressState();
        } else if (isCompleted()) {
            setCompletedState();
        }
    }
    
    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getDaysOverdue() {
        return daysOverdue;
    }

    public void setDaysOverdue(int daysOverdue) {
        this.daysOverdue = daysOverdue;
    }
    
    private boolean isOverdue(LocalDateTime now) {
        return this.deliveryDate == null && now.isAfter(this.dueDate.plusDays(ATRAZO_PADRAO));
    }

    private void setOverdueState(LocalDateTime now) {
        this.setState("OVERDUE");
        this.setDaysOverdue((int) ChronoUnit.DAYS.between(this.dueDate, now));
    }

    private boolean isInProgress(LocalDateTime now) {
        return this.deliveryDate == null && now.isBefore(this.dueDate);
    }

    private void setInProgressState() {
        this.setState("IN PROGRESS");
        this.setDaysOverdue(0);
    }

    private boolean isCompleted() {
        return this.deliveryDate != null;
    }

    private void setCompletedState() {
        this.setState("COMPLETED");
        this.setDaysOverdue(0);
    }

    /**
     *
     * @return retorna uma descrição completa do emprestimo
     */
    @Override
    public String toString() {
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        return "O usuario:  " + this.getUsuario().getNome()
                + "\n   Fez o emprestimo do livro: \n" + this.getExemplares().getLivro().toString()
                + "\n   No dia: \n   " + data.format(this.getDia_Emprestimo())
                + "\n   E deverá entragar até o dia: \n   " + data.format(this.getDia_Pra_Entregar());
    }

    /**
     *
     * @param outro o outro emprestimo a ser comparado
     * @return retorna 0 se forem iguais, 1 se este for maior e -1 se o outro
     * for maior
     */
    @Override
    public int compareTo(Emprestimo outro) {
        return this.getDia_Emprestimo().compareTo(outro.getDia_Emprestimo());
    }

    /**
     *
     * @return retorna uma representação numerica deste emprestimo
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.getUsuario());
        hash = 47 * hash + Objects.hashCode(this.getExemplares());
        hash = 47 * hash + Objects.hashCode(this.getDia_Emprestimo());
        hash = 47 * hash + Objects.hashCode(this.getDia_Pra_Entregar());
        hash = 47 * hash + Objects.hashCode(this.getDia_Entrege());
        hash = 47 * hash + Objects.hashCode(this.getEstado());
        return hash;
    }

    /**
     *
     * @param outro outro emprestimo a ser comparado
     * @return retorna true se forem iguais e false se forem diferentes
     */
    @Override
    public boolean equals(Object outro) {
        if (this == null || outro == null) {
            return false;
        }
        
        if (this.hashCode() == outro.hashCode()) {
            return true;
        }
        
        return false;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @return the exemplares
     */
    public Exemplares getExemplares() {
        return exemplares;
    }

    /**
     * @return the dia_Emprestimo
     */
    public Date getDia_Emprestimo() {
        return dia_Emprestimo;
    }

    /**
     * @return the dia_Pra_Entregar
     */
    public Date getDia_Pra_Entregar() {
        return dia_Pra_Entregar;
    }

    /**
     * @return the dia_Entrege
     */
    public Date getDia_Entrege() {
        return dia_Entrege;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        updateState();
        return estado;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @param exemplares the exemplares to set
     */
    public void setExemplares(Exemplares exemplares) {
        this.exemplares = exemplares;
    }

    /**
     * @param dia_Emprestimo the dia_Emprestimo to set
     */
    public void setDia_Emprestimo(Date dia_Emprestimo) {
        this.dia_Emprestimo = dia_Emprestimo;
    }

    /**
     * @param dia_Pra_Entregar the dia_Pra_Entregar to set
     */
    public void setDia_Pra_Entregar(Date dia_Pra_Entregar) {
        this.dia_Pra_Entregar = dia_Pra_Entregar;
    }

    /**
     * @param dia_Entrege the dia_Entrege to set
     */
    public void setDia_Entrege(Date dia_Entrege) {
        this.dia_Entrege = dia_Entrege;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the diasAtrasados
     */
    public int getDiasAtrasados() {
        return diasAtrasados;
    }

    public int autalizar_E_Pegar_Dias_Atrasados() {
        updateState();
        return diasAtrasados;
    }

    /**
     * @param diasAtrasados the diasAtrasados to set
     */
    public void setDiasAtrasados(int diasAtrasados) {
        this.diasAtrasados = diasAtrasados;
    }
}
