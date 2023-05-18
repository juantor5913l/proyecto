
package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class registerDAO implements registrar {
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    public int registra(register reg){
    String sql="Insert * from material where nombre=? and precio=? and descripcion=? and color=? and tipo=?";
    try {
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.setString(1, reg.getNombre());
        ps.setDouble(2, reg.getPrecio());
        ps.setString(3, reg.getDescripcion());
        ps.setString(4, reg.getColor());
        ps.setInt(5, reg.getMaterial());
        rs=ps.executeQuery();
