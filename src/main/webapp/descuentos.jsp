<%@ page contentType="text/html" pageEncoding="utf-8" %>

    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="description"
            content="Somos una empresa dedicada a brindar servicios turísticos a nuestros clientes." />
        <meta name="keywords" content="turismo, destinos turísticos, viaje, viajar" />
        <meta name="author" content="Rocio E. Sierra" />
        <title>Sierra Turismo</title>
        <link rel="stylesheet" href="styles.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>

    <body>
        <nav class="navbar navbar-expand-lg" style="background-color: #F9A72B;">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">
                    <img src="./images/logo.png" alt="Logo" width="20%">
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse " style="font-size: 100%;">
                    <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link" href="#">VIAJES</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">PAQUETES</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">CIRCUITOS</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="descuentos.jsp">DESCUENTOS</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">CONTACTO</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <section>
            <div class="row text-center">
                <div class="col align-self-center ">
                    <h2 class="display-6 fs-6 ">Calcular tu descuento <span class="fs-1"
                            style="display: block;">DESCUENTOS</span>
                    </h2>
                    <p>Descuento indicando el costo.</p>
                </div>
            </div>

            <form action="nuevocliente" method="post">
                <div class="row" style="padding: 1%;">
                    <div class="col">

                        <div class="form-group" style="padding: 1%;">
                            <input type="text" class="form-control" id="Correo" name="correo" placeholder="Correo">
                        </div>
                        <div class="form-group" style="padding: 1%;">
                            <input type="text" class="form-control" id="Costo" name="costo"
                                placeholder="Costo total del viaje">
                        </div>

                        <div class="form-group col-16" style="padding: 1%;">
                            <label>Categoria</label>
                            <select class="form-control" id="Categoria" name="categoria">
                                <option selected>Elegir...</option>
                                <option>Jubilados</option>
                                <option>Menores</option>
                                <option>Estudiantes</option>
                            </select>
                        </div>
                        <div class="row text-center">
                            <div class="col align-self-center">
                                <button type="submit" class="btn btn-secondary btn-lg">Enviar</button>
                            </div>
                        </div>

            </form>
<br>

            <div class="row text-center">
                <div class="col align-self-center ">
                    <h2 class="display-6 fs-6 ">DESCUENTOS<span class="fs-1" style="display: block;">Buscar tu
                            descuento</span>
                    </h2>
                    <p>Indicando tu correo</p>
                </div>
            </div>

            <form action="vercliente" method="get">
                <div class="row text-center" style="padding: 1%;">
                    <div class="col align-self-center">
                        <label>Tu correo</label>
                        <input name="correob" type="text" />
                        <button type="submit" class="btn btn-secondary btn-sm">Buscar</button>
                    </div>
                </div>
            </form>
        </section>


        <footer style="background-color: #F9A72B; text-align: center; font-family: 'Georgia'; font-size:medium" ;>
            <p>Realizado por Rocio Sierra. Todos los derechos reservados. Copyright 2022©</p>
        </footer>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous">
            </script>

    </body>

    </html>