package clase;

public class Poliza {

    public Cliente cliente;
    public Vehiculo vehiculo;
    public String numPoliza;
    public String fechaInicio;
    public String fechaFinal;
    public int cantCuotas;
    public String pago;
    public double montoTotal;
    public boolean granizo;
    public double maxGranizo;
    public String cobertura;

    public Poliza() {
    }

    public Poliza(Cliente cliente, Vehiculo vehiculo, String numPoliza, String fechaInicio, String fechaFinal, int cantCuotas, String pago, double montoTotal, boolean granizo, double maxGranizo, String cobertura) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numPoliza = numPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cantCuotas = cantCuotas;
        this.pago = pago;
        this.montoTotal = montoTotal;
        this.granizo = granizo;
        this.maxGranizo = maxGranizo;
        this.cobertura = cobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(String numPoliza) {
        this.numPoliza = numPoliza;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMaxGranizo() {
        return maxGranizo;
    }

    public void setMaxGranizo(double maxGranizo) {
        this.maxGranizo = maxGranizo;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

}
