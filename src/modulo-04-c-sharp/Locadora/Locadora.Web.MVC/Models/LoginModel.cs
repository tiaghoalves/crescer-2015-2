﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace Locadora.Web.MVC.Models
{
    public class LoginModel
    {
        [Required]
        [StringLength(200)]
        public String Email { get; set; }

        [Required]
        [StringLength(200)]
        public String Senha { get; set; }
    }
}