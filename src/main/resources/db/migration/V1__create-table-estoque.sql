
CREATE TABLE estoque (
    id SERIAL PRIMARY KEY, -- ID gerado automaticamente
    nome VARCHAR(255) NOT NULL, -- Nome do produto
    codigo_barras VARCHAR(50) NOT NULL, -- Código de barras
    validade DATE, -- Data de validade
    quantidade INT NOT NULL, -- Quantidade em estoque
    custo DECIMAL(10, 2) NOT NULL, -- Custo do produto
    valor_venda DECIMAL(10, 2) NOT NULL -- Valor de venda do produto
);