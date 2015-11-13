﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Locadora.Dominio.Servicos
{
    public class ServicoLocacao
    {
        public DateTime DataPrevistaEntrega(Selo selo)
        {
            DateTime dataAtual = DateTime.Now;
            switch (selo)
            {
                case Selo.OURO:
                    dataAtual = dataAtual.AddDays(1);
                    break;
                case Selo.PRATA:
                    dataAtual = dataAtual.AddDays(2);
                    break;

                case Selo.BRONZE:
                    dataAtual = dataAtual.AddDays(3);
                    break;
            }
            return dataAtual;
        }

        public double ValorJogo(Selo selo)
        {
            double preco = 0;
            switch (selo)
            {
                case Selo.OURO:
                    preco = 15.00;
                    break;

                case Selo.PRATA:
                    preco = 10.00;
                    break;

                case Selo.BRONZE:
                    preco = 5.00;
                    break;
            }
            return preco;
        }
    }
}
