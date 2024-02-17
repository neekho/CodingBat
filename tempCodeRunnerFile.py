def get_request_token(request_token):


    result = request_token.split('?token=')[1].upper()



    return result

