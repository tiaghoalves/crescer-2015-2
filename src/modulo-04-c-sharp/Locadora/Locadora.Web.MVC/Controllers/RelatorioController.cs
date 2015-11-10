﻿using Locadora.Dominio;
using Locadora.Dominio.Repositorio;
using Locadora.Web.MVC.Helpers;
using Locadora.Web.MVC.Models;
using Locadora.Web.MVC.Seguranca;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Locadora.Web.MVC.Controllers
{
    [Autorizador]
    public class RelatorioController : Controller
    {
        public ActionResult JogosFiltradosPorId(int id)
        {
            return View();
        }
        
        public ActionResult JogosDisponiveis(string nome)
        {
            IList<Jogo> jogosEncontrados = null;
            IJogoRepositorio jogoRepositorio = FabricaDeModulos.CriarJogoRepositorio();

            if(string.IsNullOrEmpty(nome))
            {
                jogosEncontrados = jogoRepositorio.BuscarTodos();
            }
            else
            {
                jogosEncontrados = jogoRepositorio.BuscarPorNome(nome);
            }

            RelatorioJogosDisponiveisModel model = new RelatorioJogosDisponiveisModel(jogosEncontrados);

            return View(model);
        }
        

    }
}