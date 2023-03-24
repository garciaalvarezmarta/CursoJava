package MyPackage;

import java.time.LocalDate;

public interface IUsuario {
	public LocalDate fechaRegistro();

	public LocalDate ultimoLogin();

	public int numCompras();

	public void setFecharegistro(LocalDate f);

	public void setUltimoLogin(LocalDate u);

	public void setNumCompras(int n) ;

}
