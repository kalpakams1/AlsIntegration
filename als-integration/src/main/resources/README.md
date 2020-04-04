* CA CERT

    * Run Command and navigate to Java home >>jre>>lib>>security Eg :- C:\Java\jdk1.8.0_91\jre\lib\security
    * Copy als.cer under resources to this location.
    * Execute command :-  keytool -importcert -file als.cer -keystore cacerts -alias "Als"
    * If prompted for Password type:- changeit