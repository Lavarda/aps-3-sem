ALTER TABLE cadastro_usuario ADD PRIMARY KEY (cod_usuario);
ALTER TABLE funcionarios ADD PRIMARY KEY (cod_funcionario);
ALTER TABLE cargo_funcionario ADD PRIMARY KEY (cod_cargo);
ALTER TABLE filiais ADD PRIMARY KEY (cod_filial);
ALTER TABLE fornecedor ADD PRIMARY KEY (cod_fornecedor);
ALTER TABLE produtos ADD PRIMARY KEY (cod_produto);
ALTER TABLE categoria ADD PRIMARY KEY (cod_categoria);
ALTER TABLE entrada ADD PRIMARY KEY (cod_entrada);
ALTER TABLE transferencia_fornecedor ADD PRIMARY KEY (cod_saida);
ALTER TABLE transferencia_filial ADD PRIMARY KEY (cod_transferencia);