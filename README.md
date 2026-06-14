# Projeto MarktViewPDV | Back-End

<p align="center">Sistema Web para um Gerenciamento de Comércio </p>
<p align="center">
    <a alt="Java">
        <img src="https://img.shields.io/badge/Java-v21.48.17-red.svg" />
    </a>
   <a alt="Spring Boot">
        <img src="https://img.shields.io/badge/Spring Boot-v3.5.15-Lime.svg" />
    </a>
   <a alt="Spring Data MongoDB">
        <img src="https://img.shields.io/badge/Spring Data MongoDB-v3.5.15-Lime.svg" />
    </a>
    <a alt="Spring Security">
        <img src="https://img.shields.io/badge/Spring Security-v3.5.15-Lime.svg" />
    </a>
   <a alt="Spring Test">
        <img src="https://img.shields.io/badge/Spring Test-v3.5.15-Lime.svg" />
    </a>
    <a alt="Maven">
        <img src="https://img.shields.io/badge/Maven-v4.0.0-darkblue.svg" />
    </a>
    <a alt="JWT">
        <img src="https://img.shields.io/badge/JWT-v0.12.6-blue.svg" />
    </a>
    <a alt="RabbitMQ">
        <img src="https://img.shields.io/badge/RabbitMQ-v3.5.15-purple.svg" />
    </a>
</p>

</br>

## 📌 Sobre o Projeto

<p>Solução de frente de caixa focada em performance e usabilidade. O projeto visa reduzir o tempo de resposta no atendimento ao cliente através da simplificação de processos transacionais e métodos de pagamento.</p>

</br>

<ul>
     <li><strong>🏪 Operação de Frente de Caixa:</strong> Checkout ágil com consultas de altíssima velocidade, controle de turnos por operador, suprimentos e sangrias.</li> 
     <li><strong>🎯 Clube de Vantagens (Fidelidade):</strong> Identificação instantânea via CPF/CNPJ diretamente no caixa para aplicação automatizada de descontos e pontuação síncrona.</li>
     <li><strong>🧾 Automação Fiscal Assíncrona:</strong> Emissão e gerenciamento de notas fiscais (NFC-e/NF-e) integradas à SEFAZ de forma desacoplada, evitando travamentos na tela de venda.</li>
    <li><strong>📊 Auditoria e Giro de Estoque:</strong> Rastreamento rigoroso e imutável de movimentações de inventário por produto, integrado à gestão de fornecedores.</li>
</ul>

</br>

<p>Diferencial: O sistema utiliza uma arquitetura híbrida NoSQL (MongoDB) pensada para escalar na nuvem (AWS) e se comunicar via mensageria (RabbitMQ), garantindo que o caixa continue funcionando mesmo em momentos de oscilação ou queda de internet.</p>

