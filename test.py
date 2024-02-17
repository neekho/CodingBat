
valid_tokens = ['zxcxvvb12', 'afsgerr2c']


requests = [['GET', 'https://www.example.com/?token=afsgerr2c&name=alex'], 
            ['GET', 'https://www.wikipedia.com/?token=zxfcawsdgear&name=alex'], 
            ['POST', 'https://www.facebook.com/?token=sfhsdvc23&name=nikho&city=makati&age=24']
            
            
            ]

def get_request_token(url):

    start = url.find('token=')

    end = url.find('&') if '&' in url else len(url)
    
    token = url[start:end].split('token=')[1]

    return token


def valid_csrf(url):
    pass




def getRequest(valid_auth_tokens, requests) -> list:

    response = list()


    for request in requests:

        method = request[0]
        url = request[1]
        domain = url.split('?token=')[0]
        request_token = get_request_token(url)

        valid_token = request_token in valid_auth_tokens


        if method == 'GET' and valid_token:
            response.append('VALID')

    




    return response





r = getRequest(valid_tokens, requests)


print(r)



