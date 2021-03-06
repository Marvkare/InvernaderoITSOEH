package modelo;
// Generated 6/05/2017 11:26:56 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Fungicida generated by hbm2java
 */
@Entity
@Table(name="fungicida"
    ,catalog="bdinvernadero"
)
public class Fungicida  implements java.io.Serializable {


     private Integer idFungicida;
     private String nomFungicida;
     private int cantFungicida;
     private String presentacionFun;

    public Fungicida() {
    }

    public Fungicida(String nomFungicida, int cantFungicida, String presentacionFun) {
       this.nomFungicida = nomFungicida;
       this.cantFungicida = cantFungicida;
       this.presentacionFun = presentacionFun;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_fungicida", unique=true, nullable=false)
    public Integer getIdFungicida() {
        return this.idFungicida;
    }
    
    public void setIdFungicida(Integer idFungicida) {
        this.idFungicida = idFungicida;
    }

    
    @Column(name="nom_fungicida", nullable=false, length=50)
    public String getNomFungicida() {
        return this.nomFungicida;
    }
    
    public void setNomFungicida(String nomFungicida) {
        this.nomFungicida = nomFungicida;
    }

    
    @Column(name="cant_fungicida", nullable=false)
    public int getCantFungicida() {
        return this.cantFungicida;
    }
    
    public void setCantFungicida(int cantFungicida) {
        this.cantFungicida = cantFungicida;
    }

    
    @Column(name="presentacion_fun", nullable=false, length=50)
    public String getPresentacionFun() {
        return this.presentacionFun;
    }
    
    public void setPresentacionFun(String presentacionFun) {
        this.presentacionFun = presentacionFun;
    }




}


