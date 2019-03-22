<%-- 
    Document   : visualizar
    Created on : 4/03/2019, 04:16:14 PM
    Author     : deivi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="es">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="../complementos/assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="../complementos/assets/img/eclipse.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    CEOS
  </title>
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <!--     Fonts and icons     -->
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
  <!-- CSS Files -->
  <link href="../complementos/assets/css/material-dashboard.css?v=2.1.0" rel="stylesheet" />
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <link href="../complementos/assets/demo/demo.css" rel="stylesheet" />

</head>

<body class="">
  <div class="wrapper ">
    <div class="sidebar" data-color="rose" data-background-color="black" data-image="../complementos/assets/img/sidebar-1.jpg">
      <!--
        Tip 1: You can change the color of the sidebar using: data-color="purple | azure | green | orange | danger"

        Tip 2: you can also add an image using data-image tag
    -->
      <div class="logo">
        <a href="http://www.creative-tim.com" class="simple-text logo-normal">
          <img src="../complementos/assets/img/eclipse.svg" style="width: 100px; height: 100px;" />
        </a>
      </div>
      <div class="sidebar-wrapper">
        <div class="user">
          <div class="photo">
            <img src="../complementos/assets/img/faces/avatar.jpg" />
          </div>
          <div class="user-info">
            <a data-toggle="collapse" href="#collapseExample" class="username">
              <span>
                Tania Andrew
                <b class="caret"></b>
              </span>
            </a>
            <div class="collapse" id="collapseExample">
              <ul class="nav">
                <!--<li class="nav-item">
                  <a class="nav-link" href="#">
                    <span class="sidebar-mini"> MP </span>
                    <span class="sidebar-normal"> Mi Perfil </span>
                  </a>
                </li>-->
                <li class="nav-item">
                  <a class="nav-link" href="../editar_perfil.html">
                    <span class="sidebar-mini"> EP </span>
                    <span class="sidebar-normal"> Editar Perfil </span>
                  </a>
                </li>
                <!--<li class="nav-item">
                  <a class="nav-link" href="#">
                    <span class="sidebar-mini"> C </span>
                    <span class="sidebar-normal"> Configuración </span>
                  </a>
                </li>-->
              </ul>
            </div>
          </div>
        </div>
        <ul class="nav">

          <li class="nav-item active ">
            <a class="nav-link" data-toggle="collapse" href="#tablesExamples" aria-expanded="true">
              <i class="material-icons">grid_on</i>
              <p> Tablas
                <b class="caret"></b>
              </p>
            </a>
            <div class="collapse show" id="tablesExamples">
              <ul class="nav">
                <li class="nav-item ">
                  <a class="nav-link" href="${pageContext.request.contextPath}/tablas/push_notifications">
                    <i class="material-icons">notifications</i>
                    <span class="sidebar-normal"> Push Notifications </span>
                  </a>
                </li>
                <li class="nav-item active ">
                  <a class="nav-link" href="${pageContext.request.contextPath}/tablas/base_de_datos">
                    <i class="material-icons">list_alt</i>
                    <span class="sidebar-normal"> Base de Datos </span>
                  </a>
                </li>
                <!-- <li class="nav-item ">
                  <a class="nav-link" href="${pageContext.request.contextPath}/tablas/modificar">
                    <i class="material-icons">edit</i>
                    <span class="sidebar-normal"> Modificar </span>
                  </a>
                </li> -->
                <li class="nav-item ">
                  <a class="nav-link" href="${pageContext.request.contextPath}/login">
                    <i class="material-icons">person</i>
                    <span class="sidebar-normal"> Salir </span>
                  </a>
                </li>
              </ul>
            </div>
          </li>

        </ul>
      </div>
    </div>
    <div class="main-panel">
      <!-- Navbar -->
      <nav class="navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top ">
        <div class="container-fluid">
          <div class="navbar-wrapper">
            <div class="navbar-minimize">
              <button id="minimizeSidebar" class="btn btn-just-icon btn-white btn-fab btn-round">
                <i class="material-icons text_align-center visible-on-sidebar-regular">more_vert</i>
                <i class="material-icons design_bullet-list-67 visible-on-sidebar-mini">view_list</i>
              </button>
            </div>
            <a class="navbar-brand" href="#pablo">Ocultar</a>
          </div>
          <button class="navbar-toggler" type="button" data-toggle="collapse" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
            <span class="sr-only">Toggle navigation</span>
            <span class="navbar-toggler-icon icon-bar"></span>
            <span class="navbar-toggler-icon icon-bar"></span>
            <span class="navbar-toggler-icon icon-bar"></span>
          </button>
          <div class="collapse navbar-collapse justify-content-end">
            <form class="navbar-form">
              <div class="input-group no-border">
                <input type="text" value="" class="form-control" placeholder="Buscar...">
                <button type="submit" class="btn btn-white btn-round btn-just-icon">
                  <i class="material-icons">search</i>
                  <div class="ripple-container"></div>
                </button>
              </div>
            </form>
            <ul class="navbar-nav">

              <li class="nav-item dropdown">
                <a class="nav-link" href="#pablo" id="navbarDropdownProfile" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="material-icons">person</i>
                  <p class="d-lg-none d-md-block">
                    Account
                  </p>
                </a>
                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownProfile">
                  <!--<a class="dropdown-item" href="#">Perfil</a>
                  <a class="dropdown-item" href="#">Configuración</a>
                  <div class="dropdown-divider"></div>-->
                  <a class="dropdown-item" href="${pageContext.request.contextPath}/login">Salir</a>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <!-- End Navbar -->
      <div class="content">
        <div class="container-fluid">
          <div class="row">
            <div class="col-md-12">
              <div class="card">
                <div class="card-header card-header-primary card-header-icon">
                  <div class="card-icon">
                    <i class="material-icons">assignment</i>
                  </div>
                  <h4 class="card-title">Base de Datos</h4>
                </div>
                <div class="card-body">

                    <div class="toolbar">
                      <!--        Here you can write extra buttons/actions for the toolbar              -->
                      <!--<div class="row">
                        <div class="col-md-3">
                          <select class="selectpicker" data-size="7" data-style="btn btn-primary btn-round" title="Single Select">
                            <option disabled selected>Usuarios</option>
                            <option value="2">Todos</option>
                            <option value="3">Juan</option>
                            <option value="4">Carlos</option>
                            <option value="5">Andrés</option>
                          </select>
                        </div>
                      </div> -->
                    </div>


                    <div class="material-datatables">
                      <table id="datatables" class="table table-striped table-no-bordered table-hover" cellspacing="0" width="100%" style="width:100%">
                        <thead>
                          <tr>
                            <th>Id Usuario</th>
                            <th>Usuario</th>
                            <th>Tipo</th>
                            <th>Celular</th>
                            <th>Puesto</th>
                            <th>Empresa</th>
                            <th>Diagnóstico</th>
                            <th>Acciones</th>
                          </tr>
                        </thead>
                        <tfoot>
                          <tr>
                            <th>Id Usuario</th>
                            <th>Usuario</th>
                            <th>Tipo</th>
                            <th>Celular</th>
                            <th>Puesto</th>
                            <th>Empresa</th>
                            <th>Diagnóstico</th>
                            <th>Acciones</th>
                          </tr>
                        </tfoot>
                        <tbody>
                          <c:forEach var="usuario" items="${listaUsuarios}">
                            <tr>
                              <td>${usuario[0]}</td>
                              <td>${usuario[1]}</td>                                          
                              <td>${usuario[2]}</td>  
                              <td>${usuario[3]}</td>
                              <td>${usuario[4]}</td>                                          
                              <td>${usuario[5]}</td>
                              <td>${usuario[6]}</td>
                              <td>

                                <button href="#" class="btn btn-link btn-info btn-just-icon edit" onclick="cambiarDiagnostico(1, ${usuario[0]});"><i class="material-icons">done</i>
                                </button>
                                <button href="#" class="btn btn-link btn-danger btn-just-icon remove" onclick="cambiarDiagnostico(0, ${usuario[0]});"><i class="material-icons">highlight_off</i>
                                </button>

                                <!--<a href="#" class="btn btn-link btn-danger btn-just-icon remove" onclick="demo.showSwal('warning-message-and-confirmation')"><i class="material-icons">highlight_off</i></a>-->
                              </td>
                            </tr>
                            <!-- Modal -->
                            <!--<div class="modal fade" id="exampleModal${usuario[0]}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h4 class="modal-title" id="exampleModalLabel"> Cambiar diagnostico a "Si"</h4>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-footer">
                                          
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">
                                                Volver
                                            </button>
                                            <form action="${pageContext.request.contextPath}/tablas/actualizaDiagnostico" method="POST">
                                                <input id="idUsuario" name="idUsuario" type="hidden" value ="${usuario[0]}" />
                                                <button type="submit" class="btn btn-primary">Ok</button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div> -->
                            <!-- Fin Modal -->
                          </c:forEach>
                          
                        </tbody>
                      </table>
                    </div>

                </div>
                <!-- end content-->
              </div>
              <!--  end card  -->
            </div>
            <!-- end col-md-12 -->
          </div>
          <!-- end row -->

          <div class="row">
            <div class="col-md-12">
              <div class="card ">
                <div class="card-header card-header-rose card-header-icon">
                  <div class="card-text">
                    <h4 class="card-title">Registro</h4>
                  </div>
                </div>
                <div class="card-body ">
                  <form method="POST" action="nuevoRegistro">
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group">
                          <label for="exampleEmail" class="bmd-label-floating">Usuario</label>
                          <input id="usuario" name="usuario" type="text" required="" class="form-control">
                        </div>
                        <div class="form-group">
                          <label for="examplePass" class="bmd-label-floating">Contraseña</label>
                          <input id="password" name="password" type="password" required="" class="form-control">
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <!--<label for="exampleEmail" class="bmd-label-floating">Tipo</label>-->
                          <select id="tipo" name="tipo" class="selectpicker" data-style="select-with-transition" title="Tipo" data-size="7">
                            <option value="1">Bosch</option>
                            <option value="2">CEO´s</option>
                            <option value="3">Completo</option>
                            <option value="4">Administrador</option>
                          </select>
                        </div>
                        <div class="form-group">
                          <label for="examplePass" class="bmd-label-floating">Celular</label>
                          <input id="celular" name="celular" type="text" class="form-control">
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <label for="examplePass" class="bmd-label-floating">Puesto</label>
                          <input id="puesto" name="puesto" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                          <label for="examplePass" class="bmd-label-floating">Correo</label>
                          <input id="correo" name="correo" type="text" required="" class="form-control">
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <label for="examplePass" class="bmd-label-floating">Empresa</label>
                          <input id="empresa" name="empresa" type="text" required="" class="form-control">
                        </div>
                        <div class="form-group">
                          <!--<label for="examplePass" class="bmd-label-floating">Diagnóstico</label>-->
                          <select id="diagnostico" name="diagnostico" class="selectpicker" data-style="select-with-transition" title="Diagnóstico" data-size="7">
                            <option value="0">No</option>
                            <option value="1">Si</option>
                          </select>
                        </div>
                      </div>
                    </div>

                    <div class="card-footer ">
                      <button type="submit" class="btn btn-fill btn-rose">Registrar</button>
                    </div>
                    
                  </form>
                </div>
              </div>
            </div>
          </div>

        </div>
      </div>
      <footer class="footer">
        <div class="container-fluid">
          <div class="copyright float-right">
            &copy;
            <script>
              document.write(new Date().getFullYear())
            </script>
            Powered by <a href="http://www.eclipsemex.com" target="_blank">Eclipse Labs</a>
          </div>
        </div>
      </footer>
    </div>
  </div>

  <!--   Core JS Files   -->
  <script src="../complementos/assets/js/core/jquery.min.js"></script>
  <!--<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>-->
  <script src="../complementos/assets/js/core/popper.min.js"></script>
  <script src="../complementos/assets/js/core/bootstrap-material-design.min.js"></script>
  <script src="../complementos/assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
  <!-- Plugin for the momentJs  -->
  <script src="../complementos/assets/js/plugins/moment.min.js"></script>
  <!--  Plugin for Sweet Alert -->
  <script src="../complementos/assets/js/plugins/sweetalert2.js"></script>
  <!-- Forms Validations Plugin -->
  <script src="../complementos/assets/js/plugins/jquery.validate.min.js"></script>
  <!-- Plugin for the Wizard, full documentation here: https://github.com/VinceG/twitter-bootstrap-wizard -->
  <script src="../complementos/assets/js/plugins/jquery.bootstrap-wizard.js"></script>
  <!--  Plugin for Select, full documentation here: http://silviomoreto.github.io/bootstrap-select -->
  <script src="../complementos/assets/js/plugins/bootstrap-selectpicker.js"></script>
  <!--  Plugin for the DateTimePicker, full documentation here: https://eonasdan.github.io/bootstrap-datetimepicker/ -->
  <script src="../complementos/assets/js/plugins/bootstrap-datetimepicker.min.js"></script>
  <!--  DataTables.net Plugin, full documentation here: https://datatables.net/  -->
  <script src="../complementos/assets/js/plugins/jquery.dataTables.min.js"></script>
  <!--  Plugin for Tags, full documentation here: https://github.com/bootstrap-tagsinput/bootstrap-tagsinputs  -->
  <script src="../complementos/assets/js/plugins/bootstrap-tagsinput.js"></script>
  <!-- Plugin for Fileupload, full documentation here: http://www.jasny.net/bootstrap/javascript/#fileinput -->
  <!--<script src="../../assets/js/plugins/jasny-bootstrap.min.js"></script>-->
  <!--  Full Calendar Plugin, full documentation here: https://github.com/fullcalendar/fullcalendar    -->
  <script src="../complementos/assets/js/plugins/fullcalendar.min.js"></script>

  <!-- Vector Map plugin, full documentation here: http://jvectormap.com/documentation/ -->
  <!--<script src="../complementos/assets/js/plugins/jquery-jvectormap.js"></script> -->
  
  <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
  <script src="../complementos/assets/js/plugins/nouislider.min.js"></script>
  <!-- Include a polyfill for ES6 Promises (optional) for IE11, UC Browser and Android browser support SweetAlert -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/core-js/2.4.1/core.js"></script>
  <!-- Library for adding dinamically elements -->
  <script src="../complementos/assets/js/plugins/arrive.min.js"></script>
  
  <!--  Google Maps Plugin    -->
  <!-- <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script> -->
  
  <!-- Chartist JS -->
  <script src="../complementos/assets/js/plugins/chartist.min.js"></script>
  <!--  Notifications Plugin    -->
  <script src="../complementos/assets/js/plugins/bootstrap-notify.js"></script>
  <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="../complementos/assets/js/material-dashboard.js?v=2.1.0" type="text/javascript"></script>
  <!-- Material Dashboard DEMO methods, don't include it in your project! -->
  <script src="../complementos/assets/demo/demo.js"></script>

  <script>
    var table;
    $(document).ready(function() {
      $().ready(function() {

        var myTable = $('#datatables').DataTable({
          "pagingType": "full_numbers",
          "lengthMenu": [
            [10, 25, 50, -1],
            [10, 25, 50, " todos"]
          ],
          responsive: true,
          language: {
            search: "_INPUT_",
            searchPlaceholder: "Buscar...",
          },
          columnDefs: [{
          orderable: false,
          className: 'select-checkbox',
          targets: 0
          }, {
            "targets": [0],
            "visible": false,
            "searchable": false
          }]
        });

        myTable.column(2).nodes().each(function(node,index,dt){
            if(myTable.cell(node).data() == 1){
                myTable.cell(node).data('Bosch');
            }else
            if(myTable.cell(node).data() == 2){
                myTable.cell(node).data('CEO\'s');
            }else
            if(myTable.cell(node).data() == 3){
                myTable.cell(node).data('Completo');
            }
        });

        myTable.column(6).nodes().each(function(node,index,dt){
            if(myTable.cell(node).data() == 'true'){
                myTable.cell(node).data('Si');
            }else
            if(myTable.cell(node).data() == 'false'){
                myTable.cell(node).data('No');
            }
        });


        $sidebar = $('.sidebar');

        $sidebar_img_container = $sidebar.find('.sidebar-background');

        $full_page = $('.full-page');

        $sidebar_responsive = $('body > .navbar-collapse');

        window_width = $(window).width();

        fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();

        if (window_width > 767 && fixed_plugin_open == 'Dashboard') {
          if ($('.fixed-plugin .dropdown').hasClass('show-dropdown')) {
            $('.fixed-plugin .dropdown').addClass('open');
          }

        }

        $('.fixed-plugin a').click(function(event) {
          // Alex if we click on switch, stop propagation of the event, so the dropdown will not be hide, otherwise we set the  section active
          if ($(this).hasClass('switch-trigger')) {
            if (event.stopPropagation) {
              event.stopPropagation();
            } else if (window.event) {
              window.event.cancelBubble = true;
            }
          }
        });

        $('.fixed-plugin .active-color span').click(function() {
          $full_page_background = $('.full-page-background');

          $(this).siblings().removeClass('active');
          $(this).addClass('active');

          var new_color = $(this).data('color');

          if ($sidebar.length != 0) {
            $sidebar.attr('data-color', new_color);
          }

          if ($full_page.length != 0) {
            $full_page.attr('filter-color', new_color);
          }

          if ($sidebar_responsive.length != 0) {
            $sidebar_responsive.attr('data-color', new_color);
          }
        });

        $('.fixed-plugin .background-color .badge').click(function() {
          $(this).siblings().removeClass('active');
          $(this).addClass('active');

          var new_color = $(this).data('background-color');

          if ($sidebar.length != 0) {
            $sidebar.attr('data-background-color', new_color);
          }
        });

        $('.fixed-plugin .img-holder').click(function() {
          $full_page_background = $('.full-page-background');

          $(this).parent('li').siblings().removeClass('active');
          $(this).parent('li').addClass('active');


          var new_image = $(this).find("img").attr('src');

          if ($sidebar_img_container.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {
            $sidebar_img_container.fadeOut('fast', function() {
              $sidebar_img_container.css('background-image', 'url("' + new_image + '")');
              $sidebar_img_container.fadeIn('fast');
            });
          }

          if ($full_page_background.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {
            var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');

            $full_page_background.fadeOut('fast', function() {
              $full_page_background.css('background-image', 'url("' + new_image_full_page + '")');
              $full_page_background.fadeIn('fast');
            });
          }

          if ($('.switch-sidebar-image input:checked').length == 0) {
            var new_image = $('.fixed-plugin li.active .img-holder').find("img").attr('src');
            var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');

            $sidebar_img_container.css('background-image', 'url("' + new_image + '")');
            $full_page_background.css('background-image', 'url("' + new_image_full_page + '")');
          }

          if ($sidebar_responsive.length != 0) {
            $sidebar_responsive.css('background-image', 'url("' + new_image + '")');
          }
        });

        $('.switch-sidebar-image input').change(function() {
          $full_page_background = $('.full-page-background');

          $input = $(this);

          if ($input.is(':checked')) {
            if ($sidebar_img_container.length != 0) {
              $sidebar_img_container.fadeIn('fast');
              $sidebar.attr('data-image', '#');
            }

            if ($full_page_background.length != 0) {
              $full_page_background.fadeIn('fast');
              $full_page.attr('data-image', '#');
            }

            background_image = true;
          } else {
            if ($sidebar_img_container.length != 0) {
              $sidebar.removeAttr('data-image');
              $sidebar_img_container.fadeOut('fast');
            }

            if ($full_page_background.length != 0) {
              $full_page.removeAttr('data-image', '#');
              $full_page_background.fadeOut('fast');
            }

            background_image = false;
          }
        });

        $('.switch-sidebar-mini input').change(function() {
          $body = $('body');

          $input = $(this);

          if (md.misc.sidebar_mini_active == true) {
            $('body').removeClass('sidebar-mini');
            md.misc.sidebar_mini_active = false;

            $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar();

          } else {

            $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar('destroy');

            setTimeout(function() {
              $('body').addClass('sidebar-mini');

              md.misc.sidebar_mini_active = true;
            }, 300);
          }

          // we simulate the window Resize so the charts will get updated in realtime.
          var simulateWindowResize = setInterval(function() {
            window.dispatchEvent(new Event('resize'));
          }, 180);

          // we stop the simulation of Window Resize after the animations are completed
          setTimeout(function() {
            clearInterval(simulateWindowResize);
          }, 1000);

        });
      });
    });
  </script>

  <script>

    function cambiarDiagnostico(diag, id){
      //console.log("diag: " + diag + " id: " + id);
      var diagnostico, idUser = "";
      diagnostico = diag.toString();
      idUser = id.toString();
      console.log("diag: " + diagnostico + " id: " + idUser);

      $.ajax({
        type: "POST",
        url: "cambiaDiagnostico",
        data: {
          diag: diagnostico, 
          id: idUser
        },
        async:false,
        success: function(msg) {
                  alert('Diagnostico actualizado.');
                },
        dataType: "json",
        contentType : "application/json"
      });

    }


  </script>

  <!--script>
    $(document).ready(function() {

        /*var table = $('#example').DataTable({
          //"autoWidth" : false,
          "language": {
            "url": "https://cdn.datatables.net/plug-ins/1.10.19/i18n/Spanish.json"
          },
          "columns": [
              { width: '150px'},
              { width: '120px'},
              { width: '130px'},
              { width: '100px'},
              { width: '90px'},
          ],
          "paging": false,
          "scrollY": 400,
          "scrollX": true,
          "order": [
                    [0, 'asc']
          ]

        }); */

      var table = $('#datatable').DataTable();

      // Edit record
      table.on('click', '.edit', function() {
        $tr = $(this).closest('tr');
        var data = table.row($tr).data();
        alert('You press on Row: ' + data[0] + ' ' + data[1] + ' ' + data[2] + '\'s row.');
      });

      // Delete a record
      table.on('click', '.remove', function(e) {
        $tr = $(this).closest('tr');
        table.row($tr).remove().draw();
        e.preventDefault();
      });

      //Like record
      table.on('click', '.like', function() {
        alert('You clicked on Like button');
      });
    });


    demo.showSwal();
   
  </script-->
</body>

</html>