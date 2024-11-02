package modelo;

public enum TipoUsuario {
    ADMINISTRADOR(new String[]{"CREAR_USUARIO", "EDITAR_USUARIO", "BORRAR_USUARIO", "VER_INFORMES"}),
    USUARIO_SOCIO(new String[]{"VER_INFORMES", "PARTICIPAR_ACTIVIDAD"}),
    USUARIO_NO_SOCIO(new String[]{"VER_INFORMES"});

    private final String[] permisos;

    TipoUsuario(String[] permisos) {
        this.permisos = permisos;
    }

    public String[] getPermisos() {
        return permisos;
    }

    public boolean tienePermiso(String permiso) {
        for (String p : permisos) {
            if (p.equals(permiso)) {
                return true;
            }
        }
        return false;
    }
}
