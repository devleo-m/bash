# apt-get: (Debian/Ubuntu) Gerenciar pacotes.
sudo apt-get update
sudo apt-get install nome_pacote
sudo apt-get upgrade

# yum: (RHEL/CentOS) Gerenciar pacotes.
sudo yum update
sudo yum install nome_pacote

# Processos e Serviços
# ps: Listar processos.
ps aux

# top: Monitorar processos em tempo real.
top

# kill: Terminar processos.
kill -9 PID

# Variáveis, loops e condicionais
#!/bin/bash
VAR="valor"
echo $VAR

if [ $VAR == "valor" ]; then
  echo "É igual"
fi

for i in 1 2 3; do
  echo $i
done

# history: Exibe o histórico dos comandos digitados.
history