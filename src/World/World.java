/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package World;
import Engine.*;
/**
 *
 * @author Christofer Indra Sinarya / 2013730042
 *         Ariel Jayapermana / 2013730050
 */
public class World {
    private DataCustomerService dataCostumer;
    private DataHistori dataHistori;
    private DataPelanggan dataPelanggan;
    private DataPenggunaan dataPenggunaan;
    private FasilitasInternet fasilitasInternet;
    private PaketInternet paketInternet;
    
    public World()
    {
        this.dataCostumer=new DataCustomerService();
        this.dataHistori=new DataHistori();
        this.dataPelanggan=new DataPelanggan();
        this.dataPenggunaan=new DataPenggunaan();
        this.fasilitasInternet=new FasilitasInternet();
        this.paketInternet=new PaketInternet();
    }
    
    
}
