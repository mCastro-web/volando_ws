package publishers;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import sistema.Sistema;
import data_types.*;
import model.Aerolinea;
import model.Cliente;
import model.PaqueteVuelo;
import model.Social;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@WebService
public class ControladorSistemaPublish {

    private final Sistema sistema;

    public ControladorSistemaPublish() {
        this.sistema = Sistema.getInstance();
    }

    // === CIUDAD ===
    @WebMethod
    public void altaCiudad(String nombre, String pais, String nombreAeropuerto,
            String descripcionAeropuerto, String sitioWeb, String fechaAlta) throws Exception {
        sistema.altaCiudad(nombre, pais, nombreAeropuerto, descripcionAeropuerto, sitioWeb, LocalDate.parse(fechaAlta));
    }

    // === CLIENTE ===
    @WebMethod
    public DtUsuario altaCliente(String nickname, String nombre, String email, String contrasenia, String urlImagen,
            String apellido, String nacimiento,
            String nacionalidad, String tipoDoc, String numeroDoc) {
        return sistema.altaCliente(nickname, nombre, email, contrasenia, urlImagen, apellido,
                LocalDate.parse(nacimiento), nacionalidad, TipoDoc.valueOf(tipoDoc), numeroDoc);
    }

    @WebMethod
    public DtUsuario buscarPorNick(String nickname) {
        return sistema.buscarPorNick(nickname);
    }

    @WebMethod
    public List<String> listarNicknames() {
        return sistema.listarNicknames();
    }

    @WebMethod
    public List<String> listarUsuariosPorNick() {
        return sistema.listarUsuariosPorNick();
    }

    @WebMethod
    public List<String> listarReservasDeCliente(String nicknameCliente) {
        return sistema.listarReservasDeCliente(nicknameCliente);
    }

    @WebMethod
    public List<String> listarPaquetesDeCliente(String nicknameCliente) {
        return sistema.listarPaquetesDeCliente(nicknameCliente);
    }

    @WebMethod
    public void modificarCliente(String nickname, String nombre, String email, String contrasenia, String urlImagen,
            String apellido, String nacimiento,
            String nacionalidad, String tipoDoc, String numeroDoc, String nick) {
        sistema.modificarCliente(nickname, nombre, email, contrasenia, urlImagen, apellido,
                LocalDate.parse(nacimiento), nacionalidad, TipoDoc.valueOf(tipoDoc), numeroDoc, nick);
    }

    @WebMethod
    public List<DtCliente> listarClientes() {
        List<Cliente> lista = sistema.listarClientes();
        List<DtCliente> salida = new ArrayList<>();
        for (Cliente c : lista) {
            DtCliente dto = new DtCliente(
                    c.getNickname(),
                    c.getNombre(),
                    c.getEmail(),
                    c.getUrlImagen(),
                    c.getApellido(),
                    c.getFechaNac(),
                    c.getNacionalidad(),
                    c.getTipoDocumento(),
                    c.getNumDocumento());
            salida.add(dto);
        }
        return salida;
    }

    // === AEROLÍNEA ===
    @WebMethod
    public DtUsuario altaAerolinea(String nickname, String nombre, String email, String contrasenia, String urlImagen,
            String descripcion, String sitioWeb) {
        return sistema.altaAerolinea(nickname, nombre, email, contrasenia, urlImagen, descripcion, sitioWeb);
    }

    @WebMethod
    public void modificarAerolinea(String nickname, String nombre, String email, String contrasenia, String urlImagen,
            String descripcion, String sitioWeb, String nick) {
        sistema.modificarAerolinea(nickname, nombre, email, contrasenia, urlImagen, descripcion, sitioWeb, nick);
    }

    @WebMethod
    public List<Aerolinea> listarAerolineas() {
        return sistema.listarAerolineas();
    }

    @WebMethod
    public List<String> listarNicknamesAerolineas() {
        return sistema.listarNicknamesAerolineas();
    }

    @WebMethod
    public List<String> listarRutasConfirmadasAerolinea(String nombre) {
        return sistema.listarRutasConfirmadasAerolinea(nombre);
    }

    // === USUARIO ===
    @WebMethod
    public void eliminarSocial(String idSeguidor, String idSeguido) {
        sistema.eliminarSocial(idSeguidor, idSeguido);
    }

    @WebMethod
    public void guardarSocial(String idSeguidor, String idSeguido) {
        sistema.guardarSocial(idSeguidor, idSeguido);
    }

    @WebMethod
    public DtUsuario consultaUsuario(String nickname) {
        return sistema.consultaUsuario(nickname);
    }

    @WebMethod
    public DtUsuario dataUsuarioPorNick(String nickname) {
        return sistema.dataUsuarioPorNick(nickname);
    }

    @WebMethod
    public DtUsuario iniciarSesionUsuario(String identificador, String contra) {
        return sistema.iniciarSesionUsuario(identificador, contra);
    }

    @WebMethod
    public DtUsuario cerrarSesionUsuario(String nick) {
        return sistema.cerrarSesionUsuario(nick);
    }

    // === CATEGORÍA ===
    @WebMethod
    public void altaCategoria(String nombreCategoria) throws Exception {
        sistema.altaCategoria(nombreCategoria);
    }

    @WebMethod
    public List<String> listarNombresCategorias() {
        return sistema.listarNombresCategorias();
    }

    // === RUTA DE VUELO ===
    @WebMethod
    public void altaRutaVuelo(String nombre, String descripcion, String fechaAlta,
            float costoBaseTurista, float costoBaseEjecutivo, float costoEquipajeExtra,
            String nickAerolinea, String origenNombre, String destinoNombre, String nombreCategoria, String urlImagen,
            String urlVideo, String descripcionCorta) {
        sistema.altaRutaVuelo(nombre, descripcion, LocalDate.parse(fechaAlta), costoBaseTurista, costoBaseEjecutivo,
                costoEquipajeExtra,
                nickAerolinea, origenNombre, destinoNombre, nombreCategoria, urlImagen, urlVideo, descripcionCorta);
    }

    @WebMethod
    public void actualizarEstadoRuta(String nombreRuta, String nuevoEstado) {
        sistema.actualizarEstadoRuta(nombreRuta, EstadoRuta.valueOf(nuevoEstado));
    }

    @WebMethod
    public List<String> listarRutasConfirmadasPorCategoria(String nombreCategoria) {
        return sistema.listarRutasConfirmadasPorCategoria(nombreCategoria);
    }

    @WebMethod
    public void finalizarRutaDeVuelo(String nombreRuta) {
        sistema.finalizarRutaDeVuelo(nombreRuta);
    }

    @WebMethod
    public List<String> listarNombresCiudades() {
        return sistema.listarNombresCiudades();
    }

    @WebMethod
    public DtRutaVuelo obtenerDtRutaPorNombre(String nombre) {
        return sistema.obtenerDtRutaPorNombre(nombre);
    }

    @WebMethod
    public void incrementarVisitaRuta(String nombreRuta) {
        sistema.incrementarVisitaRuta(nombreRuta);
    }

    @WebMethod
    public List<DtRutaVuelo> listarRutasMasVisitadas() {
        return sistema.listarRutasMasVisitadas();
    }

    @WebMethod
    public List<String> listarRutasPorAerolinea(String nombre) {
        return sistema.listarRutasPorAerolinea(nombre);
    }

    @WebMethod
    public List<String> listarNombresVuelosPorRuta(String nombreRuta) {
        return sistema.listarNombresVuelosPorRuta(nombreRuta);
    }

    // === VUELO ===
    @WebMethod
    public void altaVuelo(String nombre, String fecha, String duracion,
            int asientosTurista, int asientosEjecutivo, String fechaAlta, String nombreRuta, String urlImagen) {
        sistema.altaVuelo(nombre, LocalDate.parse(fecha), LocalTime.parse(duracion), asientosTurista, asientosEjecutivo,
                LocalDate.parse(fechaAlta), nombreRuta, urlImagen);
    }

    @WebMethod
    public List<DtDatosVueloR> listarVuelosDeRuta(String nombreRuta) {
        return sistema.listarVuelosDeRuta(nombreRuta);
    }

    @WebMethod
    public List<String> listarReservasDeVuelo(String nombreVuelo) {
        return sistema.listarReservasDeVuelo(nombreVuelo);
    }

    @WebMethod
    public void reservarVuelo(String nickCliente, String nombreVuelo, String tipoAsiento,
            int cantEquipaje, String fechaReserva,
            int cantPasajes, List<String> nombresPasajeros, List<String> apellidosPasajeros) {
        sistema.reservarVuelo(nickCliente, nombreVuelo, TipoAsiento.valueOf(tipoAsiento), cantEquipaje,
                LocalDate.parse(fechaReserva), cantPasajes, nombresPasajeros, apellidosPasajeros);
    }

    @WebMethod
    public DtVuelo obtenerDtVueloPorNombre(String nombreVuelo) {
        return sistema.obtenerDtVueloPorNombre(nombreVuelo);
    }

    @WebMethod
    public List<DtReserva> listarDtReservasDeVuelo(String nombreVuelo) {
        return sistema.listarDtReservasDeVuelo(nombreVuelo);
    }

    @WebMethod
    public List<String> obtenerReservasPorClienteVuelo(String vuelo, String cliente) {
        return sistema.obtenerReservasPorClienteVuelo(vuelo, cliente);
    }

    @WebMethod
    public DtReserva obtenerDtReservaPorClienteVuelo(String vuelo, String cliente) {
        return sistema.obtenerDtReservaPorClienteVuelo(vuelo, cliente);
    }

    @WebMethod
    public List<String> listarPasajesReservasDeVuelo(String nombreReserva) {
        return sistema.listarPasajesReservasDeVuelo(nombreReserva);
    }

    // === PAQUETE DE VUELO ===
    @WebMethod
    public void altaPaqueteRV(String nombre, String descripcion, Integer diasValidez, Float descuento, String fecha) {
        sistema.altaPaqueteRV(nombre, descripcion, diasValidez, descuento, LocalDate.parse(fecha));
    }

    @WebMethod
    public void agregarRutaPaquete(String nombrePaquete, String nickAerolinea, String nombreRuta, Integer cantidad,
            String tipoAsiento) {
        sistema.agregarRutaPaquete(nombrePaquete, nickAerolinea, nombreRuta, cantidad,
                TipoAsiento.valueOf(tipoAsiento));
    }

    @WebMethod
    public List<DtPaqueteVuelo> listarPaquetes() {
        List<PaqueteVuelo> lista = sistema.listarPaquetes();
        List<DtPaqueteVuelo> salida = new ArrayList<>();
        for (PaqueteVuelo p : lista) {
            DtPaqueteVuelo dto = new DtPaqueteVuelo(
                    p.getNombre(),
                    p.getDescripcion(),
                    p.getDiasValidez(),
                    p.getDescuento(),
                    p.getCosto(),
                    p.getAltaFecha());

            salida.add(dto);
        }
        return salida;
    }

    @WebMethod
    public List<DtPaqueteVuelo> listarDTPaquetes() {
        return sistema.listarDTPaquetes();
    }

    @WebMethod
    public List<String> listarNombresPaquetes() {
        return sistema.listarNombresPaquetes();
    }

    @WebMethod
    public PaqueteVuelo buscarPaqueteVuelo(String nombre) {
        return sistema.buscarPaqueteVuelo(nombre);
    }

    @WebMethod
    public List<DtItemPaquete> listarItemsDePaquete(Long idPaquete) {
        return sistema.listarItemsDePaquete(idPaquete);
    }

    @WebMethod
    public void comprarPaquete(String nickCliente, String nombrePaquete, String fechaCompra) {
        sistema.comprarPaquete(nickCliente, nombrePaquete, LocalDate.parse(fechaCompra));
    }

    @WebMethod
    public List<String> listarNombresPaquetesConRutas() {
        return sistema.listarNombresPaquetesConRutas();
    }

    @WebMethod
    public DtPaqueteVuelo obtenerDtPaquetePorNombre(String nombre) {
        return sistema.obtenerDtPaquetePorNombre(nombre);
    }

    @WebMethod
    public DtPaqueteVuelo consultaPaquete(String nombrePaquete) {
        return sistema.consultaPaquete(nombrePaquete);
    }

    @WebMethod
    public List<String> obtenerListaNombresRutasPorPaquete(String nombreReserva) {
        return sistema.obtenerListaNombresRutasPorPaquete(nombreReserva);
    }

    @WebMethod
    public List<DtReserva> listarPaquetesCompradosPorCliente(String nickCliente) {
        return sistema.listarPaquetesCompradosPorCliente(nickCliente);
    }

    // === MÉTODOS AUXILIARES ===
    @WebMethod
    public boolean validarCedulaUruguaya(String cedula) {
        return sistema.validarCedulaUruguaya(cedula);
    }

    @WebMethod
    public boolean validarPasaporte(String pasaporte) {
        return sistema.validarPasaporte(pasaporte);
    }

    @WebMethod
    public void reservarVueloConPaquete(String nickCliente, String nombreVuelo, String tipoAsiento,
            int cantEquipaje, String fechaReserva,
            int cantPasajes, List<String> nombresPasajeros, List<String> apellidosPasajeros) {
        sistema.reservarVueloConPaquete(nickCliente, nombreVuelo, TipoAsiento.valueOf(tipoAsiento), cantEquipaje,
                LocalDate.parse(fechaReserva), cantPasajes, nombresPasajeros, apellidosPasajeros);
    }

    @WebMethod
    public boolean yaSigue(String idSeguidor, String idSeguido) {
        return sistema.yaSigue(idSeguidor, idSeguido);
    }

    @WebMethod
    public boolean existeEmail(String email) {
        return sistema.existeEmail(email);
    }

    @WebMethod
    public boolean existeNickname(String nickname) {
        return sistema.existeNickname(nickname);
    }

    @WebMethod
    public List<DtRutaVuelo> buscarRutas(String query) {
        return sistema.buscarRutas(query);
    }

    @WebMethod
    public List<DtPaqueteVuelo> buscarPaquetes(String query) {
        return sistema.buscarPaquetes(query);
    }

    @WebMethod
    public List<Long> listarReservasPendientesCheckin(String nicknameCliente) {
        return sistema.listarReservasPendientesCheckin(nicknameCliente);
    }

    @WebMethod
    public void realizarCheckin(Long idReserva) {
        sistema.realizarCheckin(idReserva);
    }

    @WebMethod
    public List<Long> listarReservasConCheckin(String nicknameCliente) {
        return sistema.listarReservasConCheckin(nicknameCliente);
    }
    @WebMethod
    public DtReserva obtenerReservaCheckin(Long idReserva) {
        return sistema.obtenerReservaCheckin(idReserva);
    }

    @WebMethod
    public DtCheckin obtenerCheckinPorReserva(Long idReserva) {
        return sistema.obtenerCheckinPorReserva(idReserva);
    }


    @WebMethod
    public DtUsuarioExtendido consultaUsuarioExtendido(@WebParam(name="nick") String nick,
                                              @WebParam(name="logueado") String logueado) {
        return sistema.consultaUsuarioExtendido(nick, logueado);
    }

    @WebMethod
    public DtUsuarioExtendido dataUsuarioPorNickExtendido(@WebParam(name="nick") String nick,
                                                          @WebParam(name="logueado") String logueado) {
        return sistema.dataUsuarioPorNickExtendido(nick, logueado);
    }
}
