<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator" xmlns:oracle-xsl-mapper="http://www.oracle.com/xsl/mapper/schemas" xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue" xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction" xmlns:oraxsl="http://www.oracle.com/XSL/Transform/java" xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions" xmlns:ns0="http://www.fiap.com.br" exclude-result-prefixes=" oracle-xsl-mapper xsi xsd xsl ns0 socket dvm mhdr oraxsl oraext xp20 xref"
                xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/"
                xmlns:tns="http://oracle.com/sca/soapservice/AppPrestacaoServico/AppPrestacaoServico/SOAPServicePrestacaoServicos"
                xmlns:plt="http://schemas.xmlsoap.org/ws/2003/05/partner-link/"
                xmlns:ns1="http://xmlns.oracle.com/pcbpel/adapter/file/AppPrestacaoServico/AppPrestacaoServico/criarArquivo"
                xmlns:jca="http://xmlns.oracle.com/pcbpel/wsdl/jca/">
   <oracle-xsl-mapper:schema>
      <!--SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY.-->
      <oracle-xsl-mapper:mapSources>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="../WSDLs/SOAPServicePrestacaoServicos.wsdl"/>
            <oracle-xsl-mapper:rootElement name="CidadaoTO" namespace="http://www.fiap.com.br"/>
         </oracle-xsl-mapper:source>
      </oracle-xsl-mapper:mapSources>
      <oracle-xsl-mapper:mapTargets>
         <oracle-xsl-mapper:target type="WSDL">
            <oracle-xsl-mapper:schema location="../WSDLs/criarArquivo.wsdl"/>
            <oracle-xsl-mapper:rootElement name="CidadaoTO" namespace="http://www.fiap.com.br"/>
         </oracle-xsl-mapper:target>
      </oracle-xsl-mapper:mapTargets>
      <!--GENERATED BY ORACLE XSL MAPPER 12.2.1.2.0(XSLT Build 161003.0739.0018) AT [WED OCT 26 22:11:43 BRST 2016].-->
   </oracle-xsl-mapper:schema>
   <!--User Editing allowed BELOW this line - DO NOT DELETE THIS LINE-->
   <xsl:template match="/">
      <ns0:CidadaoTO>
         <ns0:nomeCidadao>
            <xsl:value-of select="/ns0:CidadaoTO/ns0:nomeCidadao"/>
         </ns0:nomeCidadao>
         <ns0:telefone>
            <xsl:value-of select="/ns0:CidadaoTO/ns0:telefone"/>
         </ns0:telefone>
         <ns0:email>
            <xsl:value-of select="/ns0:CidadaoTO/ns0:email"/>
         </ns0:email>
         <ns0:observacoes>
            <xsl:value-of select="/ns0:CidadaoTO/ns0:observacoes"/>
         </ns0:observacoes>
      </ns0:CidadaoTO>
   </xsl:template>
</xsl:stylesheet>