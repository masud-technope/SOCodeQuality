public int actualizarEstadoAlumno(String rut,String estado)
{
    try {
        ConexionBd();
        System.out.println("rut "+rut);
        System.out.println("estado "+estado);
        if(conexion!=null){
           PreparedStatement enunciado = conexion.prepareStatement("update alumno set alu_estado = ? "
                  + "where alu_rut = ? ;");
           if(enunciado!=null){
                enunciado.setString(1, rut);
                enunciado.setString(2, estado);
                enunciado.execute();
                return 1;
           }
        }

    } catch (SQLException sqlEx) {
       //return 0;   This isn't a good way to handle exception. How will you know that SQL Exception has occurred? You need to handle the exceptions/weird things your code can run into.
       //log exception, use logger
       //print stack trace, handle the exception or throw it 
    } catch (Exception ex){
       //log exception, use logger
       //print stack trace, handle the exception or throw it 
    }finally{
         conexion.close(); // this is why finally was born.
    }
}